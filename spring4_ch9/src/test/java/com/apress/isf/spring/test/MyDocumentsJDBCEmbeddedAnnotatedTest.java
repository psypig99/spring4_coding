package com.apress.isf.spring.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Sejun on 2015. 12. 29..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/mydocuments-jdbc-embedded-context.xml")
public class MyDocumentsJDBCEmbeddedAnnotatedTest {
}
