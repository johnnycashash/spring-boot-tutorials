package org.johnnycash.mvc.services;

import org.johnnycash.mvc.config.JpaIntegrationConfig;
import org.johnnycash.mvc.domain.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JpaIntegrationConfig.class)
@ActiveProfiles("jpadao")
public class ProductServiceJpaDaoImplTest {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    public void testListMethod() throws Exception {
        List<Product> products = (List<Product>) productService.listAll();
        Assert.assertEquals(products.size(), 5);
    }

    @Test
    public void testFindMethod() throws Exception {
        Product product = productService.getById(1);
        Assert.assertEquals(product.getDescription(), "Product 1");
    }
}
