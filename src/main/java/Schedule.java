import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @Column(name = "user_name")
    private String userName;

    private String name;

    @Column(name = "friend_name")
    private String friendName;

    private Date date;

    @Column(name = "is_work_day")
    private boolean isWork;

}
