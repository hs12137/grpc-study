package com.example.grpc_server_demo;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Data {
    public List<Dto> list;

    public Data(){
        list = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            Dto dto = Dto.builder()
                    .seatId((long) i)
                    .section(i % 3 + "구역")
                    .colNum(i)
                    .rowNum(i)
                    .build();
            list.add(dto);
        }
    }
}
