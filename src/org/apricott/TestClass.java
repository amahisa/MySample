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

			// メインスレッド内で実行
			return () -> {
				try {
					System.out.println(threadName + " executed.");;
				} catch (Exception e) {
					throw e;
				}
				return null;
			};
		});	// 非同期処理完了
		executorService.shutdown();
		result.get().call();
	}

}
