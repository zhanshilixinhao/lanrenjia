package com.lrj.lrjmanagement.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Lxh
 * @date 2020/3/11 15:39
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private Double originalPrice;
    private Double actualPrice;
}
