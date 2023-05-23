package com.sample.gof23.service.structuralpattern.flyweight;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class FlyweightClient {

	private final DocumentRepository repository ;

	public int run(String... args) {

		repository.initializeRepository();

		Document doc1 = repository.getDocument("行政文档");
		doc1.readDocument();

		Document doc2 = repository.getDocument("技术文档");
		doc2.readDocument();

		Document doc3 = repository.getDocument("财务文档");
		doc3.readDocument();

		return 0;
	}


}
