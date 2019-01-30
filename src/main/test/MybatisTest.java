import dao.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;
import service.CategoryService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:applicationContext.xml"})
public class MybatisTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testList() {

        Category cs=categoryMapper.get(4);
        System.out.print(cs.getName());

    }

    @Test
    public  void  testTransationInMybatis()
    {
        categoryService.addTwo();
    }
}
