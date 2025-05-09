package com.hula.ai.llm.internlm.entity.response;

import lombok.Data;

/**
 * 返回内容
 *
 * @author: 云裂痕
 * @date: 2024/3/25
 * @version: 1.2.0
 * 得其道
 * 乾乾
 */
@Data
public class ChatStreamChoiceDelta {

    /**
     * 角色
     */
    private String role;

    /**
     * 内容
     */
    private String content;

}
