package sep490.g13.pms_be.model.request.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSchoolRequest {
    private String schoolId;
    private String schoolName;
    private String phoneContact;
    private String emailContact;
    private String address;
    private String principalName;
    private String principalPhone;
}
