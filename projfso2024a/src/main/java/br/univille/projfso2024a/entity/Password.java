package br.univille.projfso2024a.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String toolName;
    private String email;
    private String password;
    private Integer passwordLength;
    private Boolean includeUppercase;
    private Boolean includeNumbers;
    private Boolean includeSymbols;
    private String category;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getToolName() {
        return toolName;
    }
    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getPasswordLength() {
        return passwordLength;
    }
    public void setPasswordLength(Integer passwordLength) {
        this.passwordLength = passwordLength;
    }
    public Boolean getIncludeUppercase() {
        return includeUppercase;
    }
    public void setIncludeUppercase(Boolean includeUppercase) {
        this.includeUppercase = includeUppercase;
    }
    public Boolean getIncludeNumbers() {
        return includeNumbers;
    }
    public void setIncludeNumbers(Boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }
    public Boolean getIncludeSymbols() {
        return includeSymbols;
    }
    public void setIncludeSymbols(Boolean includeSymbols) {
        this.includeSymbols = includeSymbols;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    

    // Getters and setters
    // ...
}