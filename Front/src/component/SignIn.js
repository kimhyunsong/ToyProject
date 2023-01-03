import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Button, Checkbox, Form } from 'semantic-ui-react'










export default function SignIn(data){
  const [id, setId] = useState('');
  const [pw, setPw] = useState('');


  async function checkSignIn(e){
    e.preventDefault();
    await axios.post('http://localhost:8080/signIn', {
      identification: id,
      password: pw
    })
    .then((res)=>{
      console.log(res)
    })
  }
  function idChange(e){
    e.preventDefault();
    setId(e.target.value)
  }
  function pwChange(e){
    e.preventDefault();
    setPw(e.target.value)
  }


  return(
    <>
      <h1> 로그인 페이지 </h1>
      <Form onSubmit={checkSignIn}>
        <Form.Field>
          <label>아이디</label>
          <input placeholder='아이디' onKeyUp={idChange} />
        </Form.Field>
        <Form.Field>
          <label>비밀번호</label>
          
          <input placeholder='비밀번호' onKeyUp={pwChange} type="password"/>
        </Form.Field>
        <Button type='submit'>Submit</Button>
      </Form>
    </>
  )
}