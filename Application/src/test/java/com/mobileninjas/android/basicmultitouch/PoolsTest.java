package com.mobileninjas.android.basicmultitouch;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PoolsTest {
    @Test
    public void testSimplePool() {
        Pools.SimplePool<Integer> pool = new Pools.SimplePool<>(2);
        Integer one = 1;
        assertTrue(pool.release(one));
    }
}
