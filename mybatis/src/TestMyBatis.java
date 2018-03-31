import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Category;

public class TestMyBatis {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        Category category = new Category();
        category.setName("新增的Category");
        session.insert("addCategory", category);
        listAll(session);
        Category selectC = session.selectOne("getCategory",category.getId());
        System.out.println("get one，ID："+selectC.getId() +",Name:"+ selectC.getName());
        Category updateC = new Category();
        updateC.setName("修改的Category");
        updateC.setId(selectC.getId());
        session.update("updateCategory",updateC);
        listAll(session);
        Category c = new Category();
        c.setId(category.getId());
        session.delete("deleteCategory",c);
        listAll(session);
        List<Category> cs = session.selectList("listCategory");
        System.out.println(cs.size());
        session.commit();
        session.close();
    }

    private static void listAll(SqlSession session) {
        List<Category> cs = session.selectList("listCategory");
        for (Category c : cs) {
            System.out.println(c.getName());

        }
    }
}
