package com.sample.gof23.service.structuralpattern.flyweight;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王贤
 */
@Component
public class DocumentRepository {
	
	private final AdministrativeDocument administrativeDocument = new AdministrativeDocument();

	private final TechnicalDocument technicalDocument = new TechnicalDocument();

	private final FinancialDocument financialDocument =new FinancialDocument();

	private final Map<String,Document> DocumentMap = new HashMap<>();

	
	public void initializeRepository(){
		DocumentMap.put("行政文档", this.administrativeDocument);
		DocumentMap.put("技术文档", this.technicalDocument);
		DocumentMap.put("财务文档", this.financialDocument);		
	}	
	
	public Document getDocument(String docType){		
		if (DocumentMap.containsKey(docType)){
			return DocumentMap.get(docType);
		}
		System.out.print("没有此类文档。");
		return null;
	}

}
