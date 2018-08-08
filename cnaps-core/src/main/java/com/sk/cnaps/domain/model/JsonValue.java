package com.sk.cnaps.domain.model;

import javax.persistence.AttributeConverter;

import com.sk.cnaps.domain.util.JsonUtil;

public interface JsonValue extends AttributeConverter<JsonValue, String> {	
	@Override
	default String convertToDatabaseColumn(JsonValue attribute) {
		return JsonUtil.toJsonStr(attribute);
	}
	
	@Override
	default JsonValue convertToEntityAttribute(String dbData) {
		return JsonUtil.fromJsonStr(dbData, this.getClass());
	}
}
