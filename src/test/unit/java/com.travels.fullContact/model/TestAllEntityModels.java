package com.travels.fullContact.model;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;
import com.travels.fullContact.entity.Bookings;
import com.travels.fullContact.entity.Customers;
import com.travels.fullContact.entity.Stays;

/**
 * Created by A-7631 on 5/30/2018.
 */
public class TestAllEntityModels {

  Class[]classes =  {
      Bookings.class,
      Customers.class,
      Stays.class};

  @Test()
  public void testGettersAndSetters() {
    final BeanTester tester = new BeanTester();

    Configuration configuration = new ConfigurationBuilder()
        .build();

    for(Class clas : classes){
      tester.testBean(clas, configuration);
    }
  }
}
