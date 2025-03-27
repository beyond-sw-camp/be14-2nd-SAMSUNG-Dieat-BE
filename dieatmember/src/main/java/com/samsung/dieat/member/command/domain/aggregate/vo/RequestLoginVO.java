package com.samsung.dieat.member.command.domain.aggregate.vo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RequestLoginVO {
    private String userId;
    private String userPwd;
}
