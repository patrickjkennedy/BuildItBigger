package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncAndroidTest {

    @Test
    public void testVerifyNonEmptyResponse() {
        String response = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext());
        try {
            response = endpointsAsyncTask.get();
            Log.d("testVerifyNonEmptyResponse", "Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(response);
    }
}
