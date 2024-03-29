/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.ReusablePool;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.DuplicatedInstanceException;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {

	private ReusablePool pool;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool = ReusablePool.getInstance();
		// No es nulo
		assertNotNull(pool);
		// El objeto devuelto es una instancia de ReusablePool
		assertTrue(pool instanceof ReusablePool);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		try {
			Reusable r = null;
			do {
				r = pool.acquireReusable();
				assertNotNull(r);
				assertTrue(r instanceof Reusable);
			} while (r != null);
		} catch (NotFreeInstanceException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Test method for
	 * {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		try {
			Reusable primero = pool.acquireReusable();
			assertNotNull(primero);
			assertTrue(primero instanceof Reusable);

			do {
				pool.releaseReusable(primero);
				Reusable segundo = pool.acquireReusable();
				assertTrue(primero.util().equals(segundo.util()));
				pool.releaseReusable(segundo);

				assertNotNull(primero);
				assertTrue(primero instanceof Reusable);
				assertNotNull(segundo);
				assertTrue(segundo instanceof Reusable);
			} while (primero != null);

		} catch (NotFreeInstanceException | DuplicatedInstanceException e) {
			System.err.println(e.getMessage());
		}
	}

}
