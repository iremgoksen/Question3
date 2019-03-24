/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import questions3.Questions3;

/**
 *
 * @author Kullanıcı
 */
public class AppTest {
   private Questions3 q3;
   @Before
   public void setUp() {
       q3=new Questions3();
   }
    
   @Test
   void repeatingElement() {
       String[] words={"table", "door", "book", "book", "table", "book", "table"};
       String realResult="book";
       String result=q3.repeatingElement(words);
       assertEquals(result, realResult);       
   }
}