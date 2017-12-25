package com.iber.mapper.member;

import com.iber.model.member.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer id);
    
    Member selectEmployeeByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
    
    int selectRecordByPasswordAndPhone(Map<String, Object> map);
    
    int selectRecordByPhone(String phone);
    
    Member selectDetailByPhone(String phone);
    
    Member queryEnterpriseAccount(Integer enterpriseId) ;
    
    List<Member> getEnterpriseMember(Map<String, Object> map);
    
    List<Member> getPageEnterpriseMember(Map<String, Object> map);
    
    int checkEnterpriseMember(Map<String, Object> map);
    
    int updateEnterpriseMemberRank(Map<String, Object> map);
    
    List<Member> selectMemberByIdCard(String IdCard);
    
    int updateMemberAccountStatus(Member record);
    
    int updatePassword(Member record);
    
    int updateDoneInfo(Member record);

    int updatePhoneByMemberId(Map<String, Object> map);
    
    /**
     * 更新会员图片ַ
     * @param map
     * @return
     */
    int updateMemberHeadPhoto(Map<String, Object> map);
    
    
    int updateMemberToken(Map<String, Object> map);
    
    int updateEmployeeToken(Map<String, Object> map);
    
    int updateMemberQueryMsgTime(Map<String, Object> map) ;
    
    /**
     * 上传身份证驾驶证
     * @param record
     * @return
     */
    int updateDonePhotos(Member record);
    
    String getPhoneByLatestOrdAndConnectNo(@Param("equipmentCode") String equipmentCode,
                                           @Param("chargingStatus") String chargingStatus, @Param("connectorNo") byte connectorNo);
    
    Member getRecordsByPhone(String phone);
    
    /**
     * 更新会员的等级
     * @param levelCode
     * @return
     * @author ouxx
     * @date 2017-4-22 下午5:02:47
     */
    int updateMemberLevelCode(@Param("levelCode") Integer levelCode,
                              @Param("memberId") Integer memberId);

	int updateMemberAccountStatusByMemberId(@Param("accoutStatus") String accoutStatus, @Param("id") int id);
}