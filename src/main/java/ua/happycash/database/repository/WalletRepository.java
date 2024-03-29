package ua.happycash.database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ua.happycash.database.entity.user.User;
import ua.happycash.database.entity.wallet.Wallet;
import ua.happycash.dto.wallet.WalletReadDto;

import java.util.Optional;

@Repository
public interface WalletRepository extends MongoRepository<Wallet, String> {

    Optional<WalletReadDto> getAllByUser(User user);

    Optional<WalletReadDto> getAllByUserAndId(User user, String id);


}
