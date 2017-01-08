package com.cmsc128.stadtra.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmsc128.stadtra.entities.Grade;
import com.cmsc128.stadtra.repository.GradeRepository;
import com.toolkt.utils.model.ApplicationException;
@Service("gradeService")
public class GradeServiceImpl implements GradeService{
	@Resource
	private GradeRepository gradeRepository; // repository that connects with database
	
	@Transactional
	@Override
	public Grade create(Grade Grade) {
		return gradeRepository.save(Grade);
	}

	@Transactional
	@Override
	public Grade findById(Long id) {
		return gradeRepository.findOne(id);
	}

	@Transactional(rollbackFor=ApplicationException.class)
	@Override
	public Grade update(Grade updated) throws ApplicationException {
		Grade Grade = gradeRepository.findOne(updated.getId());
		if (Grade == null) {
			throw new ApplicationException("Grade does not exist.");
		}
		
		return gradeRepository.save(updated);
	}

	@Transactional(rollbackFor=ApplicationException.class)
	@Override
	public Grade delete(Long id) throws ApplicationException {
		Grade Grade = gradeRepository.findOne(id);
		if (Grade == null) {
			throw new ApplicationException("Grade does not exist.");
		}
		gradeRepository.delete(id);
		return null;
	}
}
