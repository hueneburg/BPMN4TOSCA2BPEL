package de.ustutt.iaas.bpmn2bpel.model.param;

/**
 * Copyright 2015 IAAS University of Stuttgart <br>
 * <br>
 * 
 * @author Sebastian Wagner
 *
 */
public class ConcatParameter extends Parameter {
 

	@Override
	public ParamType getType() {
		return ParamType.CONCAT;
	}
	
	
	//Todo what else can be concaneted 

}
