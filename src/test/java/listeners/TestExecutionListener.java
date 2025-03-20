package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestExecutionListener implements IInvokedMethodListener {

    private void delayByLoop(int milliseconds) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < milliseconds) {
            // Dummy loop to introduce delay
        }
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            System.out.println("Delaying before: " + method.getTestMethod().getMethodName());
            delayByLoop(3000); // Delay before every test step
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            delayByLoop(3000); // Delay after every test step
        }
    }
}