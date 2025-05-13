package listener;

import jakarta.servlet.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestListener implements ServletRequestListener {
    private static AtomicInteger requestCount = new AtomicInteger(0);

    public void requestInitialized(ServletRequestEvent sre) {
        int count = requestCount.incrementAndGet();
        System.out.println("Request #" + count + " được xử lý.");
    }

    public void requestDestroyed(ServletRequestEvent sre) {
        // không cần xử lý gì khi kết thúc
    }
}
