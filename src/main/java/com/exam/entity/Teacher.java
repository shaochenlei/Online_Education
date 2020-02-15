package com.exam.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="Teacher对象", description="教师")
public class Teacher {
    @ApiModelProperty(value = "教师ID")
    private Integer teacherId;

    @ApiModelProperty(value = "教师名称")
    private String teacherName;

    @ApiModelProperty(value = "学院")
    private String institute;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "电话")
    private String tel;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "身份证")
    private String cardId;

    @ApiModelProperty(value = "职称")
    private String type;

    @ApiModelProperty(value = "角色(0:管理员,1:教师,2:学生)")
    private String role;
}