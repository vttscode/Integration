package lt.vytautas.controller;

import lt.vytautas.domain.Beneficiary;
import lt.vytautas.repo.BeneficiaryRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("beneficiary")
public class BeneficiaryController {
    private final BeneficiaryRepo beneficiaryRepo;

    @Autowired
    public BeneficiaryController(BeneficiaryRepo beneficiaryRepo) {
        this.beneficiaryRepo = beneficiaryRepo;
    }

    @GetMapping
    public List<Beneficiary> readAll() {
        return beneficiaryRepo.findAll();
    }

    @GetMapping("{id}")
    public Beneficiary getOneById(@PathVariable("id") Beneficiary beneficiary) {
        return beneficiary;
    }


    @PostMapping
    public Beneficiary create(@RequestBody Beneficiary beneficiary) {
        return beneficiaryRepo.save(beneficiary);
    }

    @PutMapping("{id}")
    public Beneficiary update(
            @PathVariable("id") Beneficiary beneficiaryFromDb,
            @RequestBody Beneficiary beneficiary
    ) {
        BeanUtils.copyProperties(beneficiary, beneficiaryFromDb, "id");
        return beneficiaryRepo.save(beneficiaryFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Beneficiary beneficiary) {
        beneficiaryRepo.delete(beneficiary);

    }

    @GetMapping("/q/{id}")
    public String getQrCodeById(@PathVariable("id") Beneficiary beneficiary) {
        return ("<img src=\"https://qrcode.tec-it.com/API/QRCode?data=" + "Uniq code:" + beneficiary.getUniqCode()) + "    name:"+beneficiary.getName() +"&backcolor=%23ffffff\" />";
    }
}
