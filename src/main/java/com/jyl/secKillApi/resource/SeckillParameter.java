package com.jyl.secKillApi.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeckillParameter {
    private Long seckillSwagId;
    private BigDecimal dealPrice;
    @NotNull(message = "phone num cannot be null")
    private Long userPhone;
    @NotNull(message = "url cannot be null")
    private String md5Url;
}
