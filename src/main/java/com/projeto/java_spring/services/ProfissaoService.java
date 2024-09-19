package com.projeto.java_spring.services;
import com.projeto.java_spring.model.Profissao;
import com.projeto.java_spring.repository.ProfissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfissaoService {

    @Autowired
    private ProfissaoRepository profissaoRepository;

    public List<Profissao> getAllProfissoes() {
        return profissaoRepository.findAll();
    }

    public Profissao getProfissaoById(int id) {
        Optional<Profissao> profissao = profissaoRepository.findById(id);
        return profissao.orElse(null);
    }

    @Transactional
    public Profissao saveProfissao(Profissao profissao) {
        return profissaoRepository.save(profissao);
    }

    @Transactional
    public Profissao updateProfissao(int id, Profissao updatedProfissao) {
        Optional<Profissao> existingProfissao = profissaoRepository.findById(id);
        if (existingProfissao.isPresent()) {
            Profissao profissao = existingProfissao.get();
            profissao.setNome(updatedProfissao.getNome());
            return profissaoRepository.save(profissao);
        }
        return null;
    }

    @Transactional
    public boolean deleteProfissao(int id) {
        Optional<Profissao> existingProfissao = profissaoRepository.findById(id);
        if (existingProfissao.isPresent()) {
            profissaoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}