package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Request;

public class RequestTest {
    private EntityManagerFactory emf;
    private EntityManager em;
    private Request request; 
    
    @Before
      public void setUp() throws Exception {
        this.emf = Persistence.createEntityManagerFactory("AutoDB");
        this.em = emf.createEntityManager();
        request = em.find(Request.class, 1);
    }
    
    @After
      public void tearDown() throws Exception { 
        this.em.close();
        this.emf.close();
        request = null;
    }
    
    @Test
    public void test_request() {
    		assertEquals(1, request.getId());
    }
    
    @Test
    public void test_request_mapping() {
    		assertNotNull(request.getId());
    		assertNotNull(request.getDescription());
    		assertNull(request.getCompleteDate());
    		assertNotNull(request.isCompleted());
    		assertNull(request.getImg());
    		assertNull(request.getExpireDate());
    		assertNull(request.getPostDate());
    		assertNotNull(request.getEstimate());
    		assertNotNull(request.isActive());
    }
    
    @Test
    public void test_request_to_user_mapping() {
    		assertNotNull(request.getUser().getId());
    		assertNotNull(request.getUser().getLastName());
    }
    
    @Test
    public void test_request_to_vehicle_mapping() {
    	assertNotNull(request.getVehicle().getId());
    	assertNotNull(request.getVehicle().getMake());
    }
    
//    @Test
//    public void test_vehicle_mapping() {
//        assertEquals("Muffler", request.getParts().get(0).getName().toString());
//    }
    
}