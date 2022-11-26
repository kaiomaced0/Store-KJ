package br.unitins.kj.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;

import br.unitins.kj.model.Produto;

@ApplicationScoped
public class ProdutoRepository extends Repository<Produto>{

	public List<Produto> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT p FROM Compra p ORDER BY p.nome DESC");
		return query.getResultList();
	}
	public List<Produto> buscarPeloNome(String nome) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT "); 
		jpql.append("  p ");
		jpql.append("FROM ");
		jpql.append("  Produto p ");
		jpql.append("WHERE ");
		jpql.append("  upper(p.nome) LIKE upper(:nome) ");
		jpql.append("ORDER BY p.nome ");
		
		Query query = getEntityManager().createQuery(jpql.toString());
		query.setParameter("nome", "%"+nome+"%");
		
		return query.getResultList();
		
	}
}
