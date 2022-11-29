import React, { useState } from 'react'
import { Button, Checkbox, Form } from 'semantic-ui-react'




function checkSignIn(e){
  e.preventDefault();
  console.log(e.target);
}
function idChange(e){
  e.preventDefault();
  console.log(e.target.value)
}

export default function SignIn(){
  const [id, setId] = useState();
  
  
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
          <input placeholder='비밀번호' type="password"/>
        </Form.Field>
        <Button type='submit'>Submit</Button>
      </Form>
    </>
  )
}