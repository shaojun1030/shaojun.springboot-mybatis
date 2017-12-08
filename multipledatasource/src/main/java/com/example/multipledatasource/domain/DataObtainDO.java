package com.example.multipledatasource.domain;


import com.example.multipledatasource.common.domain.BaseDO;

import java.util.Date;


/**
 * 数据提取记录
 *
 * @author zhanggj
 * @date 2017-11-17 10:20:47
 */
public class DataObtainDO implements BaseDO {
    private static final long serialVersionUID = 1L;

    //主键
    private Long    id;
    //标题
    private String  title;
    //描述
    private String  description;
    //执行SQL语句
    private String  execSql;
    //开始执行时间
    private Date    execBegin;
    //结束执行时间
    private Date    execEnd;
    //执行状态：0等待执行，1执行成功，2执行失败
    private Integer status;
    //文件下载路径
    private String  filePath;
    //文件名称
    private String  fileName;
    //执行失败原因
    private String  failedReason;
    //创建时间
    private Date    createdAt;
    //创建人
    private Long    createdBy;
    //创建时间
    private Date    updatedAt;
    //创建人
    private Long    updatedBy;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExecSql() {
        return execSql;
    }

    public void setExecSql(String execSql) {
        this.execSql = execSql;
    }

    public Date getExecBegin() {
        return execBegin;
    }

    public void setExecBegin(Date execBegin) {
        this.execBegin = execBegin;
    }

    public Date getExecEnd() {
        return execEnd;
    }

    public void setExecEnd(Date execEnd) {
        this.execEnd = execEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

}
