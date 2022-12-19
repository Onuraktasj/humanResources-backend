package com.onuraktas.humanresources.repository;

import com.onuraktas.humanresources.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses,Long> {
}
