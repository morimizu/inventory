package com.benjaminrperry.inventory.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.io.Serializable;
import java.util.List;

public class PageableInventoryRecordDto extends PageImpl<InventoryRecordDto> implements Serializable {
    static final long serialVersionUID = 5799817334590932297L;
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public PageableInventoryRecordDto(@JsonProperty("content") List<InventoryRecordDto> content,
                                      @JsonProperty("number") int number,
                                      @JsonProperty("size") int size,
                                      @JsonProperty("pageable") JsonNode pageable,
                                      @JsonProperty("totalElements") long totalElements,
                                      @JsonProperty("last") boolean last,
                                      @JsonProperty("totalPages") int totalPages,
                                      @JsonProperty("sort") JsonNode sort,
                                      @JsonProperty("first") boolean first,
                                      @JsonProperty("numberOfElements") int numberOfElements) {
        super(content, PageRequest.of(number, size), totalElements);
    }

    public PageableInventoryRecordDto(List<InventoryRecordDto> content) {
        super(content);
    }
}
