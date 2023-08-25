package com.library.dao;

import com.library.domain.CustomerDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CustomerDaoImplTest {

    @Autowired
    private CustomerDao customerDao;


    @Test
    public void selectByCustNO() throws Exception{
        int cust_no = customerDao.selectAll().get(0).getCust_no();
        System.out.println(cust_no);

        CustomerDto customerDto = customerDao.selectByCustNo(cust_no);
        System.out.println(customerDto);
    }
    @Test
    public void selectAll() throws Exception{
        System.out.println(customerDao.selectAll());
    }

    @Test
    public void insertTest() throws Exception{
        CustomerDto customerDto = new CustomerDto("ghfj","010-1234-1234","aaa@naver.com","P");
        int rowCnt = customerDao.insert(customerDto);
        System.out.println("customerDto = " + customerDto);
        System.out.println("rowCnt = " + rowCnt);
        assertTrue(rowCnt == 1);
    }

    // 삭제, 전체삭제, 수정 테스트
    @Test
    public void delete() throws Exception{
        customerDao.deleteAll();
        CustomerDto customerDto = new CustomerDto("ghfj","010-1234-1234","aaa@naver.com","P");
        int rowCnt = customerDao.insert(customerDto);
        assertTrue(rowCnt == 1);


        int cust_no = customerDao.selectAll().get(0).getCust_no();
        String cust_name = customerDao.selectAll().get(0).getCust_name();

        int rowCnt2 = customerDao.delete(cust_no, cust_name);
        assertTrue(rowCnt2 == 1);
    }
    @Test
    public void deleteAll() throws Exception{
        customerDao.deleteAll();
        System.out.println(customerDao.selectAll());
    }
    @Test
    public void update() throws Exception{

        customerDao.deleteAll();
        CustomerDto customerDto = new CustomerDto("aaa", "010-1111-1111", "kkk@naver.com","G");
        assertTrue(customerDao.insert(customerDto) == 1);

        int cust_no = customerDao.selectAll().get(0).getCust_no();
        customerDto.setCust_no(cust_no);
        customerDto.setPhone("010-2222-2222");
        customerDto.setCust_email("asdfasdf");
        customerDto.setCust_name("dongmin");
        customerDto.setGrade("a");

        System.out.println("customerDto = " + customerDto.getPhone());

        customerDao.update(customerDto);



    }

}