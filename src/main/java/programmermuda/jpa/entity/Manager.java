package programmermuda.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee{

    @Column(name = "total_employee")
    private Integer totalEmployee;

    public Integer getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(Integer totalEmployee) {
        this.totalEmployee = totalEmployee;
    }
}
