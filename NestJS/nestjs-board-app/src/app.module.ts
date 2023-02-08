import { Module } from '@nestjs/common';
import { BoardsModule } from './boards/boards.module';
import { TypeOrmModule } from '@nestjs/typeorm';
import { typeORMmConfig } from './config/typeorm.config';

@Module({
  imports: [
      TypeOrmModule.forRoot(typeORMmConfig),
      BoardsModule
  ],
})
export class AppModule {}
