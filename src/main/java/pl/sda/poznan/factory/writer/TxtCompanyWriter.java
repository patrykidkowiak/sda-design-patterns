package pl.sda.poznan.factory.writer;

import pl.sda.poznan.factory.model.Company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TxtCompanyWriter implements  CompanyWriter {


    private final String path;

    public TxtCompanyWriter(String path) {
        this.path = path;
    }

    @Override


    public void write(Company company) {
        List<String> employee = company.getEmployees().stream().map(e->e.toString()).collect(Collectors.toList());

        try {
            //Write przyjmuje sciezke do pliku u Iterable<? extends Charsequence>
            Files.write(Paths.get(path), employee);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
