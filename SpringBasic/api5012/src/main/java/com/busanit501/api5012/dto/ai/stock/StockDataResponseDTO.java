package com.busanit501.api5012.dto.ai.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class StockDataResponseDTO {

    @JsonProperty("Date")  // JSON의 "Date" 필드를 "date"에 매핑
    private String date;

    @JsonProperty("Open")  // JSON의 "Open" 필드를 "open"에 매핑
    private double open;

    @JsonProperty("High")  // JSON의 "High" 필드를 "high"에 매핑
    private double high;

    @JsonProperty("Low")  // JSON의 "Low" 필드를 "low"에 매핑
    private double low;

    @JsonProperty("Close")  // JSON의 "Close" 필드를 "close"에 매핑
    private double close;
}
