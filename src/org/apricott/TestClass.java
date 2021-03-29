package org.apricott;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestClass {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Callable<?>> result = executorService.submit(() -> {
			String threadName = Thread.currentThread().getName();

			// ���C���X���b�h���Ŏ��s
			return () -> {
				try {
					System.out.println(threadName + " executed.");;
				} catch (Exception e) {
					throw e;
				}
				return null;
			};
		});	// �񓯊���������
		executorService.shutdown();
		result.get().call();
	}

}
