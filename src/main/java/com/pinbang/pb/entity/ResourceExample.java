package com.pinbang.pb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(String value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(String value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(String value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(String value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(String value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(String value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLike(String value) {
            addCriterion("r_type like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotLike(String value) {
            addCriterion("r_type not like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<String> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<String> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(String value1, String value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(String value1, String value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRCoverIsNull() {
            addCriterion("r_cover is null");
            return (Criteria) this;
        }

        public Criteria andRCoverIsNotNull() {
            addCriterion("r_cover is not null");
            return (Criteria) this;
        }

        public Criteria andRCoverEqualTo(String value) {
            addCriterion("r_cover =", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverNotEqualTo(String value) {
            addCriterion("r_cover <>", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverGreaterThan(String value) {
            addCriterion("r_cover >", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverGreaterThanOrEqualTo(String value) {
            addCriterion("r_cover >=", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverLessThan(String value) {
            addCriterion("r_cover <", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverLessThanOrEqualTo(String value) {
            addCriterion("r_cover <=", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverLike(String value) {
            addCriterion("r_cover like", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverNotLike(String value) {
            addCriterion("r_cover not like", value, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverIn(List<String> values) {
            addCriterion("r_cover in", values, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverNotIn(List<String> values) {
            addCriterion("r_cover not in", values, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverBetween(String value1, String value2) {
            addCriterion("r_cover between", value1, value2, "rCover");
            return (Criteria) this;
        }

        public Criteria andRCoverNotBetween(String value1, String value2) {
            addCriterion("r_cover not between", value1, value2, "rCover");
            return (Criteria) this;
        }

        public Criteria andRTitleIsNull() {
            addCriterion("r_title is null");
            return (Criteria) this;
        }

        public Criteria andRTitleIsNotNull() {
            addCriterion("r_title is not null");
            return (Criteria) this;
        }

        public Criteria andRTitleEqualTo(String value) {
            addCriterion("r_title =", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotEqualTo(String value) {
            addCriterion("r_title <>", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleGreaterThan(String value) {
            addCriterion("r_title >", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleGreaterThanOrEqualTo(String value) {
            addCriterion("r_title >=", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLessThan(String value) {
            addCriterion("r_title <", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLessThanOrEqualTo(String value) {
            addCriterion("r_title <=", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLike(String value) {
            addCriterion("r_title like", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotLike(String value) {
            addCriterion("r_title not like", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleIn(List<String> values) {
            addCriterion("r_title in", values, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotIn(List<String> values) {
            addCriterion("r_title not in", values, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleBetween(String value1, String value2) {
            addCriterion("r_title between", value1, value2, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotBetween(String value1, String value2) {
            addCriterion("r_title not between", value1, value2, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleIsNull() {
            addCriterion("r_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andRSubtitleIsNotNull() {
            addCriterion("r_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andRSubtitleEqualTo(String value) {
            addCriterion("r_subtitle =", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleNotEqualTo(String value) {
            addCriterion("r_subtitle <>", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleGreaterThan(String value) {
            addCriterion("r_subtitle >", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("r_subtitle >=", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleLessThan(String value) {
            addCriterion("r_subtitle <", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleLessThanOrEqualTo(String value) {
            addCriterion("r_subtitle <=", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleLike(String value) {
            addCriterion("r_subtitle like", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleNotLike(String value) {
            addCriterion("r_subtitle not like", value, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleIn(List<String> values) {
            addCriterion("r_subtitle in", values, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleNotIn(List<String> values) {
            addCriterion("r_subtitle not in", values, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleBetween(String value1, String value2) {
            addCriterion("r_subtitle between", value1, value2, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRSubtitleNotBetween(String value1, String value2) {
            addCriterion("r_subtitle not between", value1, value2, "rSubtitle");
            return (Criteria) this;
        }

        public Criteria andRPicpathIsNull() {
            addCriterion("r_picpath is null");
            return (Criteria) this;
        }

        public Criteria andRPicpathIsNotNull() {
            addCriterion("r_picpath is not null");
            return (Criteria) this;
        }

        public Criteria andRPicpathEqualTo(String value) {
            addCriterion("r_picpath =", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathNotEqualTo(String value) {
            addCriterion("r_picpath <>", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathGreaterThan(String value) {
            addCriterion("r_picpath >", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("r_picpath >=", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathLessThan(String value) {
            addCriterion("r_picpath <", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathLessThanOrEqualTo(String value) {
            addCriterion("r_picpath <=", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathLike(String value) {
            addCriterion("r_picpath like", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathNotLike(String value) {
            addCriterion("r_picpath not like", value, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathIn(List<String> values) {
            addCriterion("r_picpath in", values, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathNotIn(List<String> values) {
            addCriterion("r_picpath not in", values, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathBetween(String value1, String value2) {
            addCriterion("r_picpath between", value1, value2, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRPicpathNotBetween(String value1, String value2) {
            addCriterion("r_picpath not between", value1, value2, "rPicpath");
            return (Criteria) this;
        }

        public Criteria andRUrlIsNull() {
            addCriterion("r_url is null");
            return (Criteria) this;
        }

        public Criteria andRUrlIsNotNull() {
            addCriterion("r_url is not null");
            return (Criteria) this;
        }

        public Criteria andRUrlEqualTo(String value) {
            addCriterion("r_url =", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlNotEqualTo(String value) {
            addCriterion("r_url <>", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlGreaterThan(String value) {
            addCriterion("r_url >", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlGreaterThanOrEqualTo(String value) {
            addCriterion("r_url >=", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlLessThan(String value) {
            addCriterion("r_url <", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlLessThanOrEqualTo(String value) {
            addCriterion("r_url <=", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlLike(String value) {
            addCriterion("r_url like", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlNotLike(String value) {
            addCriterion("r_url not like", value, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlIn(List<String> values) {
            addCriterion("r_url in", values, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlNotIn(List<String> values) {
            addCriterion("r_url not in", values, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlBetween(String value1, String value2) {
            addCriterion("r_url between", value1, value2, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRUrlNotBetween(String value1, String value2) {
            addCriterion("r_url not between", value1, value2, "rUrl");
            return (Criteria) this;
        }

        public Criteria andRWeightIsNull() {
            addCriterion("r_weight is null");
            return (Criteria) this;
        }

        public Criteria andRWeightIsNotNull() {
            addCriterion("r_weight is not null");
            return (Criteria) this;
        }

        public Criteria andRWeightEqualTo(Byte value) {
            addCriterion("r_weight =", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightNotEqualTo(Byte value) {
            addCriterion("r_weight <>", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightGreaterThan(Byte value) {
            addCriterion("r_weight >", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightGreaterThanOrEqualTo(Byte value) {
            addCriterion("r_weight >=", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightLessThan(Byte value) {
            addCriterion("r_weight <", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightLessThanOrEqualTo(Byte value) {
            addCriterion("r_weight <=", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightIn(List<Byte> values) {
            addCriterion("r_weight in", values, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightNotIn(List<Byte> values) {
            addCriterion("r_weight not in", values, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightBetween(Byte value1, Byte value2) {
            addCriterion("r_weight between", value1, value2, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightNotBetween(Byte value1, Byte value2) {
            addCriterion("r_weight not between", value1, value2, "rWeight");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}