package com.example.grpc_client_demo;

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

    public static Dto fromProto(SeatInfo seatInfo){
        return Dto.builder()
                .seatId(seatInfo.getSeatId())
                .section(seatInfo.getSection())
                .rowNum(seatInfo.getRowNum())
                .colNum(seatInfo.getColNum())
                .build();
    }
}
