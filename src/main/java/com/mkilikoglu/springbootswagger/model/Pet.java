package com.mkilikoglu.springbootswagger.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Api(value = "Pet Model",description = "Pet Model")
public class Pet {
    @ApiModelProperty(value = "pet identity")
    private int id;

    @ApiModelProperty("Pet Name")
    private String name;

    @ApiModelProperty(value = "Pet birthDay")
    private Date date;
}
