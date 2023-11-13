/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModel.QuanLySanPham;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "co_tay")
@ToString
@Entity

public class CoTay {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_co_tay")
    private int id_co_tay;
    
    @Column(name = "ma")
    private String ma;
    
    @Column(name = "ten")
    private String ten;
    
    @Column(name = "created_at")
    private LocalDate created_at;
    
    @Column(name = "updated_at")
    private LocalDate updated_at;
    
    @Column(name = "created_by")
    private String created_by;
    
    @Column(name = "updated_by")
    private String updated_by;
    
    
}