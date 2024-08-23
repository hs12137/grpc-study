package com.example.grpc_server_demo;

import lombok.Builder;
import lombok.Getter;
import org.test.lib.SeatInfo;

@Builder
@Getter
public class Dto{
    private Long seatId;
    private String section;
    private int rowNum;
    private int colNum;

    public SeatInfo toData() {
        return SeatInfo.newBuilder()
                .setSeatId(this.seatId)
                .setSection(this.section)
                .setRowNum(this.rowNum)
                .setColNum(this.colNum)
                .build();
    }
}
