package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.models.Payroll;
import com.vikovalfo.hcm_be.services.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @RequestMapping(method = GET, path = "list-payrolls")
    public List<Payroll> getSalaries(){
        return payrollService.getSalaries();
    }

    @RequestMapping(method = GET, path = "payroll-details/{id}")
    public Payroll newPayroll(@PathVariable("id") Long id){
        return payrollService.getPayroll(id);
    }

    @RequestMapping(method = POST, path = "new-payroll")
    public Payroll getPayroll(@RequestBody Payroll payroll){
        return payrollService.createNewPayroll(payroll);
    }

    @RequestMapping(method = PUT, path = "update-payroll/{id}")
    public Payroll updatePayroll(@PathVariable("id") Long id, @RequestBody Payroll payroll){
        return payrollService.updatePayroll(id, payroll);
    }

    @RequestMapping(method = DELETE, path = "delete-payroll/{id}")
    public ResponseEntity<String> deletePayroll(@PathVariable("id") Long id){
        payrollService.deletePayroll(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
