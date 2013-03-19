package net.sourceforge.pmd.lang.java.rule.stanly.datastructure.domainelement;

import net.sourceforge.pmd.lang.java.rule.stanly.datastructure.metricelement.ClassMetric;


public class ClassDomain extends ElementNode {
	public ClassMetric metric;
	
	public ClassDomain(ElementNode parent, ElementNodeType type, String name) {
		super(parent,type, name);
		// TODO Auto-generated constructor stub
		if(metric == null)
			metric = new ClassMetric();
	}
	public ClassDomain(ElementNodeType type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
		if(metric == null)
			metric = new ClassMetric();
	}

}