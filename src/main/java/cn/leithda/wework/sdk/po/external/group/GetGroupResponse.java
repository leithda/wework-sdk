package cn.leithda.wework.sdk.po.external.group;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取客户群详情响应
 *
 * @author leithda
 * @since 2022/5/31
 */
public class GetGroupResponse extends BaseResponse {
    /**
     * 客户群ID
     */
    private String chat_id;
    /**
     * 群名
     */
    private String name;
    /**
     * 群主ID
     */
    private String owner;
    /**
     * 群的创建时间
     */
    private Integer create_time;
    /**
     * 群公告
     */
    private String notice;
    /**
     * 群成员列表
     */
    private List<GroupMember> member_list;
    /**
     * 群管理员列表
     */
    private List<GroupAdmin> admin_list;

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public List<GroupMember> getMember_list() {
        return member_list;
    }

    public void setMember_list(List<GroupMember> member_list) {
        this.member_list = member_list;
    }

    public List<GroupAdmin> getAdmin_list() {
        return admin_list;
    }

    public void setAdmin_list(List<GroupAdmin> admin_list) {
        this.admin_list = admin_list;
    }

    /**
     * 群成员
     */
    public static class GroupMember {
        /**
         * 群成员id
         */
        private String userid;
        /**
         * 成员类型。
         * 1 - 企业成员
         * 2 - 外部联系人
         */
        private Integer type;
        /**
         * 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当群成员类型是微信用户（包括企业成员未添加好友），且企业绑定了微信开发者ID有此字段（查看绑定方法）。第三方不可获取，上游企业不可获取下游企业客户的unionid字段
         */
        private String unionid;
        /**
         * 入群时间
         */
        private Integer join_time;
        /**
         * 入群方式。
         * 1 - 由群成员邀请入群（直接邀请入群）
         * 2 - 由群成员邀请入群（通过邀请链接入群）
         * 3 - 通过扫描群二维码入群
         */
        private Integer join_scene;
        /**
         * 邀请者。目前仅当是由本企业内部成员邀请入群时会返回该值
         */
        private GroupInvitor invitor;
        /**
         * 在群里的昵称
         */
        private String group_nickname;
        /**
         * 名字。仅当 need_name = 1 时返回
         * 如果是微信用户，则返回其在微信中设置的名字
         * 如果是企业微信联系人，则返回其设置对外展示的别名或实名
         */
        private String name;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getUnionid() {
            return unionid;
        }

        public void setUnionid(String unionid) {
            this.unionid = unionid;
        }

        public Integer getJoin_time() {
            return join_time;
        }

        public void setJoin_time(Integer join_time) {
            this.join_time = join_time;
        }

        public Integer getJoin_scene() {
            return join_scene;
        }

        public void setJoin_scene(Integer join_scene) {
            this.join_scene = join_scene;
        }

        public GroupInvitor getInvitor() {
            return invitor;
        }

        public void setInvitor(GroupInvitor invitor) {
            this.invitor = invitor;
        }

        public String getGroup_nickname() {
            return group_nickname;
        }

        public void setGroup_nickname(String group_nickname) {
            this.group_nickname = group_nickname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 邀请者。目前仅当是由本企业内部成员邀请入群时会返回该值
     */
    public static class GroupInvitor {
        /**
         * 邀请者的userid
         */
        private String userid;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }
    }

    /**
     * 群管理员
     */
    public static class GroupAdmin {
        /**
         * 群管理员userid
         */
        private String userid;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }
    }
}
