/*
 * @author Dongmin.lee
 * @since 2023-03-21
 * @version 23.03.21
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.jiraissue.service;

import com.arms.jiraissue.model.JiraIssueEntity;
import com.arms.pdservice.model.PdServiceEntity;
import com.egovframework.javaservice.treeframework.service.TreeService;

public interface JiraIssue extends TreeService {

    public String miningDataToaRMS() throws Exception;

    public JiraIssueEntity makeIssueForReqAdd(JiraIssueEntity jiraIssueEntity) throws Exception;

}