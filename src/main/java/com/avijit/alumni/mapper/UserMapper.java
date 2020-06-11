package com.avijit.alumni.mapper;


import com.avijit.alumni.common.exception.EntityNotFoundException;
import com.avijit.alumni.common.util.PasswordUtil;
import com.avijit.alumni.dto.UserDTO;
import com.avijit.alumni.entity.*;
import com.avijit.alumni.repository.UserRepository;
import com.avijit.alumni.service.BatchService;
import com.avijit.alumni.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.avijit.alumni.common.util.PasswordUtil.EncType.BCRYPT_ENCODER;

/**
 * Author: Avijit Barua
 * Created On 6/11/20 at 11:08 AM
 * Project: alumni
 */
@Service
public class UserMapper {
    private final RoleService roleService;
    private final BatchService batchService;
    private final UserRepository userRepository;

    @Autowired
    public UserMapper(RoleService roleService, BatchService batchService, UserRepository userRepository) {
        this.roleService = roleService;
        this.batchService = batchService;
        this.userRepository = userRepository;
    }

    public User requestMapper(UserDTO dto) throws Exception {
        User user = null;
        User tempUser = null;

        if (dto.getId() == null) {
            user = new User();
        } else {
            tempUser = userRepository.findFirstById(dto.getId());
            user = tempUser;
            if (user == null)
                throw new EntityNotFoundException("User not fond");
        }

        user.setId(dto.getId());
        user.setUsername(dto.getUserName());
        if (dto.getId() == null) {
            user.setPassword(PasswordUtil.encryptPassword(dto.getPassword(), BCRYPT_ENCODER, null));
        } else {
            user.setPassword(tempUser.getPassword());
        }

        Role role = roleService.readById(dto.getRoleId());
        if (role == null)
            throw new EntityNotFoundException("Role not fount with id ");
        user.setRole(role);

        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setFirstName(dto.getFirstName());
        basicInfo.setMiddleName(dto.getMiddleName());
        basicInfo.setLastName(dto.getLastName());
        basicInfo.setDob(dto.getDob());
        basicInfo.setGender(dto.getGender());
        basicInfo.setBloodGroup(dto.getBloodGroup());
        basicInfo.setReligion(dto.getReligion());

        user.setBasicInfo(basicInfo);

        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setMobile(dto.getMobile());
        contactInfo.setEmail(dto.getEmail());
        contactInfo.setPresentAddress(dto.getPresentAddress());
        contactInfo.setPermanentAddress(dto.getPermanentAddress());
        contactInfo.setFacebookAddress(dto.getFacebookAddress());
        contactInfo.setLinkedInAddress(dto.getLinkedInAddress());
        user.setContactInfo(contactInfo);

        Batch batch = batchService.readById(dto.getBatchId());
        if (batch == null)
            throw new EntityNotFoundException("batch not found with id");
        user.setBatch(batch);

        return user;
    }

    public UserDTO responseMapper(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUserName(user.getUsername());
        dto.setRoleId(user.getRole().getId());
        dto.setFirstName(user.getBasicInfo().getFirstName());
        dto.setMiddleName(user.getBasicInfo().getMiddleName());
        dto.setLastName(user.getBasicInfo().getLastName());
        dto.setDob(user.getBasicInfo().getDob());
        dto.setGender(user.getBasicInfo().getGender());
        dto.setBloodGroup(user.getBasicInfo().getBloodGroup());
        dto.setReligion(user.getBasicInfo().getReligion());
        dto.setMobile(user.getContactInfo().getMobile());
        dto.setEmail(user.getContactInfo().getEmail());
        dto.setPresentAddress(user.getContactInfo().getPresentAddress());
        dto.setPermanentAddress(user.getContactInfo().getPermanentAddress());
        dto.setFacebookAddress(user.getContactInfo().getFacebookAddress());
        dto.setLinkedInAddress(user.getContactInfo().getLinkedInAddress());
        dto.setBatchId(user.getBatch().getId());
        return dto;

    }
}
