package com.travels.fullContact.model;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.EqualsMethodTester;
import org.meanbean.test.HashCodeMethodTester;
import com.travels.fullContact.model.response.HolidayResponse;
import com.travels.fullContact.model.response.StaysResponse;

/**
 * Created by Nithin on 5/30/2018.
 */
public class TestAllResponseModels {


  Class[] classes = { HolidayResponse.class, StaysResponse.class };

  @Test()
  public void testGettersAndSetters() {
    final BeanTester tester = new BeanTester();

    for (Class clas : classes) {
      tester.testBean(clas);
    }
  }

  @Test()
  public void testEquals() {
    final EqualsMethodTester tester = new EqualsMethodTester();
    for (Class clas : classes) {
      tester.testEqualsMethod(clas);
    }
  }

  @Test()
  public void testHashCode() {
    final HashCodeMethodTester tester = new HashCodeMethodTester();
    for (Class clas : classes) {
      tester.testHashCodeMethod(clas);
    }
  }
}
