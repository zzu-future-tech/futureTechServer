package cn.futuretech.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SortExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMatchidIsNull() {
            addCriterion("matchid is null");
            return (Criteria) this;
        }

        public Criteria andMatchidIsNotNull() {
            addCriterion("matchid is not null");
            return (Criteria) this;
        }

        public Criteria andMatchidEqualTo(Long value) {
            addCriterion("matchid =", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidNotEqualTo(Long value) {
            addCriterion("matchid <>", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidGreaterThan(Long value) {
            addCriterion("matchid >", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidGreaterThanOrEqualTo(Long value) {
            addCriterion("matchid >=", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidLessThan(Long value) {
            addCriterion("matchid <", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidLessThanOrEqualTo(Long value) {
            addCriterion("matchid <=", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidIn(List<Long> values) {
            addCriterion("matchid in", values, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidNotIn(List<Long> values) {
            addCriterion("matchid not in", values, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidBetween(Long value1, Long value2) {
            addCriterion("matchid between", value1, value2, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidNotBetween(Long value1, Long value2) {
            addCriterion("matchid not between", value1, value2, "matchid");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andOccasionIsNull() {
            addCriterion("occasion is null");
            return (Criteria) this;
        }

        public Criteria andOccasionIsNotNull() {
            addCriterion("occasion is not null");
            return (Criteria) this;
        }

        public Criteria andOccasionEqualTo(String value) {
            addCriterion("occasion =", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotEqualTo(String value) {
            addCriterion("occasion <>", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionGreaterThan(String value) {
            addCriterion("occasion >", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionGreaterThanOrEqualTo(String value) {
            addCriterion("occasion >=", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionLessThan(String value) {
            addCriterion("occasion <", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionLessThanOrEqualTo(String value) {
            addCriterion("occasion <=", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionLike(String value) {
            addCriterion("occasion like", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotLike(String value) {
            addCriterion("occasion not like", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionIn(List<String> values) {
            addCriterion("occasion in", values, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotIn(List<String> values) {
            addCriterion("occasion not in", values, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionBetween(String value1, String value2) {
            addCriterion("occasion between", value1, value2, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotBetween(String value1, String value2) {
            addCriterion("occasion not between", value1, value2, "occasion");
            return (Criteria) this;
        }

        public Criteria andDressid1IsNull() {
            addCriterion("dressid1 is null");
            return (Criteria) this;
        }

        public Criteria andDressid1IsNotNull() {
            addCriterion("dressid1 is not null");
            return (Criteria) this;
        }

        public Criteria andDressid1EqualTo(Long value) {
            addCriterion("dressid1 =", value, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1NotEqualTo(Long value) {
            addCriterion("dressid1 <>", value, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1GreaterThan(Long value) {
            addCriterion("dressid1 >", value, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1GreaterThanOrEqualTo(Long value) {
            addCriterion("dressid1 >=", value, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1LessThan(Long value) {
            addCriterion("dressid1 <", value, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1LessThanOrEqualTo(Long value) {
            addCriterion("dressid1 <=", value, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1In(List<Long> values) {
            addCriterion("dressid1 in", values, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1NotIn(List<Long> values) {
            addCriterion("dressid1 not in", values, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1Between(Long value1, Long value2) {
            addCriterion("dressid1 between", value1, value2, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid1NotBetween(Long value1, Long value2) {
            addCriterion("dressid1 not between", value1, value2, "dressid1");
            return (Criteria) this;
        }

        public Criteria andDressid2IsNull() {
            addCriterion("dressid2 is null");
            return (Criteria) this;
        }

        public Criteria andDressid2IsNotNull() {
            addCriterion("dressid2 is not null");
            return (Criteria) this;
        }

        public Criteria andDressid2EqualTo(Long value) {
            addCriterion("dressid2 =", value, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2NotEqualTo(Long value) {
            addCriterion("dressid2 <>", value, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2GreaterThan(Long value) {
            addCriterion("dressid2 >", value, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2GreaterThanOrEqualTo(Long value) {
            addCriterion("dressid2 >=", value, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2LessThan(Long value) {
            addCriterion("dressid2 <", value, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2LessThanOrEqualTo(Long value) {
            addCriterion("dressid2 <=", value, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2In(List<Long> values) {
            addCriterion("dressid2 in", values, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2NotIn(List<Long> values) {
            addCriterion("dressid2 not in", values, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2Between(Long value1, Long value2) {
            addCriterion("dressid2 between", value1, value2, "dressid2");
            return (Criteria) this;
        }

        public Criteria andDressid2NotBetween(Long value1, Long value2) {
            addCriterion("dressid2 not between", value1, value2, "dressid2");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterionForJDBCDate("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterionForJDBCDate("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterionForJDBCDate("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_modified not between", value1, value2, "gmtModified");
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